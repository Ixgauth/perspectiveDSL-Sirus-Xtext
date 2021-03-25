/**
 * generated by Xtext 2.23.0
 */
package ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.generator;

import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.generator.ElementMapping;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.generator.PerspectiveSpecification;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Language;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Perspective;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PerspectiveDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Perspective> _filter = Iterables.<Perspective>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Perspective.class);
    for (final Perspective perspective : _filter) {
      String _lowerCase = perspective.getName().toLowerCase();
      String _plus = ("ca/mcgill/sel/core/perspective/" + _lowerCase);
      String _plus_1 = (_plus + "/");
      String _name = perspective.getName();
      String _plus_2 = (_plus_1 + _name);
      String _plus_3 = (_plus_2 + ".java");
      fsa.generateFile(_plus_3, 
        this.compile(perspective));
    }
    Iterable<Perspective> _filter_1 = Iterables.<Perspective>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Perspective.class);
    for (final Perspective perspective_1 : _filter_1) {
      String _lowerCase_1 = perspective_1.getName().toLowerCase();
      String _plus_4 = ("ca/mcgill/sel/core/perspective/" + _lowerCase_1);
      String _plus_5 = (_plus_4 + "/");
      String _name_1 = perspective_1.getName();
      String _plus_6 = (_plus_5 + _name_1);
      String _plus_7 = (_plus_6 + "Specification.java");
      fsa.generateFile(_plus_7, 
        PerspectiveSpecification.compile(perspective_1));
    }
    Iterable<Perspective> _filter_2 = Iterables.<Perspective>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Perspective.class);
    for (final Perspective perspective_2 : _filter_2) {
      String _lowerCase_2 = perspective_2.getName().toLowerCase();
      String _plus_8 = ("ca/mcgill/sel/core/perspective/" + _lowerCase_2);
      String _plus_9 = (_plus_8 + "/");
      String _plus_10 = (_plus_9 + "ElementMapping.java");
      fsa.generateFile(_plus_10, 
        ElementMapping.compile(perspective_2));
    }
  }
  
  private CharSequence compile(final Perspective perspective) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ca.mcgill.sel.core.perspective.");
    String _lowerCase = perspective.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.commons.ResourceUtil;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.commons.emf.util.AdapterFactoryRegistry;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.commons.emf.util.ResourceManager;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.core.COREArtefact;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.core.COREConcern;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.core.COREExternalLanguage;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.core.COREPerspective;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.core.CoreFactory;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.core.CorePackage;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.core.provider.CoreItemProviderAdapterFactory;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.core.util.COREModelUtil;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.core.util.CoreResourceFactoryImpl;");
    _builder.newLine();
    _builder.append("import ca.mcgill.sel.ram.ui.utils.ResourceUtils;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is the base class for creating and then saving a perspective. To instantiate and then save");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* the bnew poerspective, just run the class as a regular java class..");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @author Hyacinth Ali");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*@generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _name = perspective.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Initialize ResourceManager");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ResourceManager.initialize();");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Initialize CORE packages.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("CorePackage.eINSTANCE.eClass();");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Register resource factories");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ResourceManager.registerExtensionFactory(\"core\", new CoreResourceFactoryImpl());");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Initialize adapter factories");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AdapterFactoryRegistry.INSTANCE.addAdapterFactory(CoreItemProviderAdapterFactory.class);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ResourceUtils.loadLibraries();");
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// create a perspective");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("COREConcern perspectiveConcern = COREModelUtil.createConcern(\"");
    String _displayName = perspective.getDisplayName();
    _builder.append(_displayName, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("COREPerspective perspective = CoreFactory.eINSTANCE.createCOREPerspective();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("perspective.setName(\"");
    String _displayName_1 = perspective.getDisplayName();
    _builder.append(_displayName_1, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("//Add perspective to the concern");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("perspectiveConcern.getArtefacts().add(perspective);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Add existing external languages, if any");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("List<String> languages = ResourceUtil.getResourceListing(\"models/testlanguages/\", \".core\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (languages != null) {");
    _builder.newLine();
    {
      EList<Language> _languages = perspective.getLanguages();
      for(final Language language : _languages) {
        _builder.append("        \t");
        _builder.append("for (String l : languages) {");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("\t");
        _builder.append("// load existing languages");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("\t");
        _builder.append("URI fileURI = URI.createURI(l);");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("\t");
        _builder.append("COREConcern languageConcern = (COREConcern) ResourceManager.loadModel(fileURI);");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("\t");
        _builder.append("for (COREArtefact a : languageConcern.getArtefacts()) {");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("\t\t");
        _builder.append("if (a instanceof COREExternalLanguage) {");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("\t\t\t");
        _builder.append("COREExternalLanguage existingLanguage = (COREExternalLanguage) a;");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("\t\t\t");
        _builder.append("if (existingLanguage.getName().equals(\"");
        String _name_1 = language.getName();
        _builder.append(_name_1, "        \t\t\t\t");
        _builder.append("\")) {");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t");
        _builder.append("\t\t\t\t");
        _builder.append("perspective.getLanguages().put(\"");
        String _roleName = language.getRoleName();
        _builder.append(_roleName, "        \t\t\t\t\t");
        _builder.append("\", existingLanguage);");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t");
        _builder.append("\t\t\t");
        _builder.append("} ");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// initialize perspective with perspective actions and mappings");
    _builder.newLine();
    _builder.append("        ");
    String _name_2 = perspective.getName();
    _builder.append(_name_2, "        ");
    _builder.append("Specification.initializePerspective(perspective);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String fileName = \"/Users/hyacinthali/git/touchram/ca.mcgill.sel.ram/resources/models/testperspectives/\"");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("+ \"");
    String _name_3 = perspective.getName();
    _builder.append(_name_3, "           ");
    _builder.append("_Perspective\";");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("ResourceManager.saveModel(perspectiveConcern, fileName.concat(\".\" + \"core\"));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (IOException e) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// Shouldn\'t happen.");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
