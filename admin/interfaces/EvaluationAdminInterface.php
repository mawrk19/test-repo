<?php
namespace App\Admin\Interfaces;

class EvaluationAdminInterface
{
    public function manuallyCompleteEvaluation($evaluationId)
    {
        // Update evaluation state to Manually Completed
        $evaluation = Evaluation::find($evaluationId);
        $evaluation->state = 'Manually Completed';
        $evaluation->save();
    }

    public function archiveEvaluation($evaluationId)
    {
        // Update evaluation state to Archived
        $evaluation = Evaluation::find($evaluationId);
        $evaluation->state = 'Archived';
        $evaluation->save();
    }
}