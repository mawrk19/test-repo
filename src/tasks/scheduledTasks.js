const cron = require('node-cron');
const Evaluation = require('../models/Evaluation');
const termEndDate = new Date('2024-12-15T00:00:00.000Z'); // Replace with actual term end date
const threeWeeksBeforeTermEnd = new Date(termEndDate.getTime() - 21 * 24 * 60 * 60 * 1000);

// Schedule task to run every day at midnight
 cron.schedule('0 0 * * *', async () => {
  const evaluations = await Evaluation.find({ state: 'Pending', termEndDate: { $lte: threeWeeksBeforeTermEnd } });
  evaluations.forEach(evaluation => {
    evaluation.state = 'Open';
    evaluation.save();
  });
});