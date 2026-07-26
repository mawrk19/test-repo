@extends('admin.layout')

@section('content')
    <h1>Evaluations</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Student</th>
                <th>Employer</th>
                <th>State</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            @foreach($evaluations as $evaluation)
                <tr>
                    <td>{{ $evaluation->id }}</td>
                    <td>{{ $evaluation->student->name }}</td>
                    <td>{{ $evaluation->employer->name }}</td>
                    <td>{{ $evaluation->state }}</td>
                    <td>
                        @if($evaluation->state !== 'Manually Completed' && $evaluation->state !== 'Archived')
                            <a href="{{ route('admin.evaluations.manually-complete', $evaluation->id) }}">Manually Complete</a>
                            <a href="{{ route('admin.evaluations.archive', $evaluation->id) }}">Archive</a>
                        @endif
                    </td>
                </tr>
            @endforeach
        </tbody>
    </table>
@endsection