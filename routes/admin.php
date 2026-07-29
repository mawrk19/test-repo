<?php
use Illuminate\Support\Facades\Route;

Route::get('/evaluations', 'EvaluationAdminController@index')->name('admin.evaluations.index');
Route::post('/evaluations/{evaluationId}/manually-complete', 'EvaluationAdminController@manuallyCompleteEvaluation')->name('admin.evaluations.manually-complete');
Route::post('/evaluations/{evaluationId}/archive', 'EvaluationAdminController@archiveEvaluation')->name('admin.evaluations.archive');