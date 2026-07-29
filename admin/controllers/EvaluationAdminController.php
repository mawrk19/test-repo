<?php
namespace App\Admin\Controllers;

class EvaluationAdminController extends Controller
{
    public function manuallyCompleteEvaluation(Request $request, $evaluationId)
    {
        $evaluationAdminInterface = new EvaluationAdminInterface();
        $evaluationAdminInterface->manuallyCompleteEvaluation($evaluationId);
        return redirect()->back()->with('success', 'Evaluation manually completed');
    }

    public function archiveEvaluation(Request $request, $evaluationId)
    {
        $evaluationAdminInterface = new EvaluationAdminInterface();
        $evaluationAdminInterface->archiveEvaluation($evaluationId);
        return redirect()->back()->with('success', 'Evaluation archived');
    }
}