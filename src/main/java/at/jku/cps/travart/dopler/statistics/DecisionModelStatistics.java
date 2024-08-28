package at.jku.cps.travart.dopler.statistics;

import java.util.logging.Level;
import java.util.logging.Logger;

import at.jku.cps.travart.core.common.IStatistics;
import at.jku.cps.travart.dopler.decision.IDecisionModel;
import at.jku.cps.travart.dopler.decision.model.IDecision;

public class DecisionModelStatistics implements IStatistics<IDecisionModel>{

    @Override
    public long getVariabilityElementsCount(final IDecisionModel model) {
        return model.size();
    }

    @Override
    public long getConstraintsCount(final IDecisionModel model) {
        long count = 0;
        for (IDecision<?> decision: model.getDecisions()) {
            count += decision.getRules().size();
        }
        return count;
    }

    @Override
    public void logModelStatistics(final Logger logger, final IDecisionModel model) {
        logger.log(Level.INFO, "#Questions: {0}", getVariabilityElementsCount(model));
        logger.log(Level.INFO, "#Rules: {0}", getConstraintsCount(model));
    }

}
