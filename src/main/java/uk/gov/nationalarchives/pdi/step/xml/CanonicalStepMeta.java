package uk.gov.nationalarchives.pdi.step.xml;

import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.*;

public class CanonicalStepMeta extends BaseStepMeta implements StepMetaInterface {

    private String outputField;

    @Override
    public void setDefault() {

    }

    @Override
    public StepInterface getStep(StepMeta stepMeta, StepDataInterface stepDataInterface, int copyNr, TransMeta transMeta, Trans trans) {
        return null;
    }

    @Override
    public StepDataInterface getStepData() {
        return null;
    }

    public String getOutputField() {
        return outputField;
    }
}
