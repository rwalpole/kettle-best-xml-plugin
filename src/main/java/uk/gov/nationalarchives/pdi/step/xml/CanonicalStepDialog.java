package uk.gov.nationalarchives.pdi.step.xml;

import org.eclipse.swt.widgets.Shell;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.BaseStepMeta;
import org.pentaho.di.trans.step.StepDialogInterface;
import org.pentaho.di.ui.trans.step.BaseStepDialog;

public class CanonicalStepDialog  extends BaseStepDialog implements StepDialogInterface {

    private final CanonicalStepMeta meta;

    public CanonicalStepDialog(final Shell parent, final Object in, final TransMeta transMeta, final String sname) {
        super(parent, (BaseStepMeta) in, transMeta, sname);
        meta = (CanonicalStepMeta) in;
    }
    @Override
    public String open() {
        return null;
    }
}
