/*******************************************************************************
 * Copyright (c) 2007 Pascal Essiembre.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Pascal Essiembre - initial API and implementation
 ******************************************************************************/
package org.eclipse.babel.editor.preferences;

import org.eclipse.babel.core.message.resource.ser.IPropertiesDeserializerConfig;
import org.eclipse.babel.core.message.resource.ser.IPropertiesSerializerConfig;
import org.eclipse.babel.editor.plugin.MessagesEditorPlugin;
import org.eclipse.core.runtime.Preferences;

/**
 * Messages Editor preferences.
 * @author Pascal Essiembre (pascal@essiembre.com)
 */
public final class MsgEditorPreferences
        implements IPropertiesSerializerConfig, IPropertiesDeserializerConfig {
   
    /** Key group separator. */
    public static final String GROUP__LEVEL_SEPARATOR =
            "groupLevelSeparator"; //$NON-NLS-1$

    /** Should key tree be hiearchical by default. */
    public static final String KEY_TREE_HIERARCHICAL =
            "keyTreeHierarchical"; //$NON-NLS-1$
    /** Should key tree be expanded by default. */
    public static final String KEY_TREE_EXPANDED = 
            "keyTreeExpanded"; //$NON-NLS-1$
    
    /** Should "Generated by" line be added to files. */
    public static final String SHOW_SUPPORT_ENABLED =
            "showSupportEnabled"; //$NON-NLS-1$

    /** Should Eclipse "nl" directory structure be supported. */
    public static final String NL_SUPPORT_ENABLED =
            "nLSupportEnabled"; //$NON-NLS-1$

    /** Should resources also be loaded from fragments. */
    public static final String SUPPORT_FRAGMENTS = "supportFragments"; //$NON-NLS-1$
    /** 
     * Load only fragment resources when loading from fragments.
     * The default bundle is mostly located in the host plug-in. 
     */
    public static final String LOADING_ONLY_FRAGMENT_RESOURCES =
            "loadingOnlyFragmentResources";
    
    /** Should tab characters be inserted when tab key pressed on text field. */
    public static final String FIELD_TAB_INSERTS = 
            "fieldTabInserts"; //$NON-NLS-1$

    /** Should equal signs be aligned. */
    public static final String ALIGN_EQUALS_ENABLED = 
            "alignEqualsEnabled"; //$NON-NLS-1$
    /** Should spaces be put around equal signs. */
    public static final String SPACES_AROUND_EQUALS_ENABLED = 
            "spacesAroundEqualsEnabled"; //$NON-NLS-1$

    /** Should keys be grouped. */
    public static final String GROUP_KEYS_ENABLED =
            "groupKeysEnabled"; //$NON-NLS-1$
    /** How many level deep should keys be grouped. */
    public static final String GROUP_LEVEL_DEEP = 
            "groupLevelDeep"; //$NON-NLS-1$
    /** How many line breaks between key groups. */
    public static final String GROUP_SEP_BLANK_LINE_COUNT =
            "groupSepBlankLineCount"; //$NON-NLS-1$
    /** Should equal signs be aligned within groups. */
    public static final String GROUP_ALIGN_EQUALS_ENABLED = 
            "groupAlignEqualsEnabled"; //$NON-NLS-1$

    /** Should lines be wrapped. */
    public static final String WRAP_LINES_ENABLED =
            "wrapLinesEnabled"; //$NON-NLS-1$
    /** Maximum number of character after which we should wrap. */
    public static final String WRAP_LINE_LENGTH = "wrapLineLength"; //$NON-NLS-1$
    /** Align subsequent lines with equal signs. */
    public static final String WRAP_ALIGN_EQUALS_ENABLED = 
            "wrapAlignEqualsEnabled"; //$NON-NLS-1$
    /** Number of spaces to indent subsequent lines. */
    public static final String WRAP_INDENT_LENGTH = 
            "wrapIndentLength"; //$NON-NLS-1$
    
    /** Should unicode values be converted to their encoded equivalent. */
    public static final String UNICODE_ESCAPE_ENABLED = 
            "unicodeEscapeEnabled"; //$NON-NLS-1$
    /** Should unicode values be converted to their encoded equivalent. */
    public static final String UNICODE_ESCAPE_UPPERCASE = 
            "unicodeEscapeUppercase"; //$NON-NLS-1$
    /** Should encoded values be converted to their unicode equivalent. */
    public static final String UNICODE_UNESCAPE_ENABLED = 
            "unicodeUnescapeEnabled"; //$NON-NLS-1$
    
    /** Impose a given new line type. */
    public static final String FORCE_NEW_LINE_TYPE = 
            "forceNewLineType"; //$NON-NLS-1$
    /** How new lines are represented in resource bundle. */
    public static final String NEW_LINE_STYLE = "newLineStyle"; //$NON-NLS-1$
    /** Should new lines character produce a line break in properties files. */
    public static final String NEW_LINE_NICE = "newLineNice"; //$NON-NLS-1$

    /** Report missing values. */
    public static final String REPORT_MISSING_VALUES = 
            "detectMissingValues"; //$NON-NLS-1$
    /** Report duplicate values. */
    public static final String REPORT_DUPL_VALUES = 
            "reportDuplicateValues"; //$NON-NLS-1$
    /** Report similar values. */
    public static final String REPORT_SIM_VALUES = 
            "reportSimilarValues"; //$NON-NLS-1$
    /** Report similar values: word compare. */
    public static final String REPORT_SIM_VALUES_WORD_COMPARE = 
            "reportSimilarValuesWordCompare"; //$NON-NLS-1$
    /** Report similar values: levensthein distance. */
    public static final String REPORT_SIM_VALUES_LEVENSTHEIN = 
            "reportSimilarValuesLevensthein"; //$NON-NLS-1$
    /** Report similar values: precision. */
    public static final String REPORT_SIM_VALUES_PRECISION = 
            "reportSimilarValuesPrecision"; //$NON-NLS-1$
    
    /** Don't show the tree within the editor. */
    public static final String EDITOR_TREE_HIDDEN =
            "editorTreeHidden"; //$NON-NLS-1$

    /** Keep empty fields. */
    public static final String KEEP_EMPTY_FIELDS = 
            "keepEmptyFields"; //$NON-NLS-1$
    
    // PAUL
    /** Display comment editor for default language. */
    public static final String DISPLAY_DEFAULT_COMMENT_FIELD =
            "displayCommentFieldNL"; //$NON-NLS-1$
    /** Display comment editor for all languages*/
    public static final String DISPLAY_LANG_COMMENT_FIELDS =
            "displayLangCommentFieldsNL"; //$NON-NLS-1$
    
    
    /** MsgEditorPreferences. */
    private static final Preferences PREFS = 
            MessagesEditorPlugin.getDefault().getPluginPreferences();
    
    private static final MsgEditorPreferences INSTANCE =
                new MsgEditorPreferences();
    
    /**
     * Constructor.
     */
    private MsgEditorPreferences() {
        super();
    }

    public static MsgEditorPreferences getInstance() {
        return INSTANCE;
    }
    
    /**
     * Gets key group separator.
     * @return key group separator.
     */
    public String getGroupLevelSeparator() {
        return PREFS.getString(GROUP__LEVEL_SEPARATOR);
    }

    /**
     * Gets whether pressing tab inserts a tab in a field.
     * @return <code>true</code> if pressing tab inserts a tab in a field
     */
    public boolean isFieldTabInserts() {
        return PREFS.getBoolean(FIELD_TAB_INSERTS);
    }
    
    /**
     * Gets whether equals signs should be aligned when generating file.
     * @return <code>true</code> if equals signs should be aligned
     */
    public boolean isAlignEqualsEnabled() {
        return PREFS.getBoolean(ALIGN_EQUALS_ENABLED);
    }

    /**
     * Gets whether there should be spaces around equals signs when generating 
     * file.
     * @return <code>true</code> there if should be spaces around equals signs
     */
    public boolean isSpacesAroundEqualsEnabled() {
        return PREFS.getBoolean(SPACES_AROUND_EQUALS_ENABLED);
    }

    /**
     * Gets whether keys should be grouped when generating file.
     * @return <code>true</code> if keys should be grouped
     */
    public boolean isGroupKeysEnabled() {
        return PREFS.getBoolean(GROUP_KEYS_ENABLED);
    }

    /**
     * Gets how many level deep keys should be grouped when generating file.
     * @return how many level deep
     */
    public int getGroupLevelDepth() {
        return PREFS.getInt(GROUP_LEVEL_DEEP);
    }
    
    /**
     * Gets how many blank lines should separate groups when generating file.
     * @return how many blank lines between groups
     */
    public int getGroupSepBlankLineCount() {
        return PREFS.getInt(GROUP_SEP_BLANK_LINE_COUNT);
    }

    /**
     * Gets whether equal signs should be aligned within each groups when
     * generating file.
     * @return <code>true</code> if equal signs should be aligned within groups
     */
    public boolean isGroupAlignEqualsEnabled() {
        return PREFS.getBoolean(GROUP_ALIGN_EQUALS_ENABLED);
    }

    /**
     * Gets whether key tree should be displayed in hiearchical way by default.
     * @return <code>true</code> if hierarchical
     */
    public boolean isKeyTreeHierarchical() {
        return PREFS.getBoolean(KEY_TREE_HIERARCHICAL);
    }
    /**
     * Gets whether key tree should be show expaned by default.
     * @return <code>true</code> if expanded
     */
    public boolean isKeyTreeExpanded() {
        return PREFS.getBoolean(KEY_TREE_EXPANDED);
    }

    /**
     * Gets whether to print "Generated By..." comment when generating file.
     * @return <code>true</code> if we print it
     */
    public boolean isShowSupportEnabled() {
        return PREFS.getBoolean(SHOW_SUPPORT_ENABLED);
    }

    /**
     * Gets whether to support Eclipse NL directory structure.
     * @return <code>true</code> if supported
     */
    public boolean isNLSupportEnabled() {
        return PREFS.getBoolean(NL_SUPPORT_ENABLED);
    }
    
    /**
     * Gets whether to support resources found in fragments.
     * @return <code>true</code> if supported
     */
    public boolean isLoadingOnlyFragmentResources() {
        return PREFS.getBoolean(LOADING_ONLY_FRAGMENT_RESOURCES);
    }
    
    /**
     * Gets whether to support resources found in fragments.
     * @return <code>true</code> if supported
     */
    public boolean getSupportFragments() {
        return PREFS.getBoolean(SUPPORT_FRAGMENTS);
    }
    
    /**
     * Gets whether lines should be wrapped if too big when generating file.
     * @return <code>true</code> if wrapped
     */
    public boolean isWrapLinesEnabled() {
        return PREFS.getBoolean(WRAP_LINES_ENABLED);
    }
    
//    /**
//     * True iff the I18N editor page should contiain a comment field for the
//     * default language
//     * 
//     * @return boolean
//     */
//    public static boolean getDisplayDefaultCommentField() {
//        return PREFS.getBoolean(DISPLAY_DEFAULT_COMMENT_FIELD);
//    }
//    
//    /**
//     * True iff the I18N editor page should contain a comment field for each
//     * individual language
//     * 
//     * @return boolean
//     */
//    public static boolean getDisplayLangCommentFields() {
//        return PREFS.getBoolean(DISPLAY_LANG_COMMENT_FIELDS);
//    }
//    
    /**
     * Gets the number of character after which lines should be wrapped when
     * generating file.
     * @return number of characters
     */
    public int getWrapLineLength() {
        return PREFS.getInt(WRAP_LINE_LENGTH);
    }

    /**
     * Gets whether wrapped lines should be aligned with equal sign when
     * generating file.
     * @return <code>true</code> if aligned
     */
    public boolean isWrapAlignEqualsEnabled() {
        return PREFS.getBoolean(WRAP_ALIGN_EQUALS_ENABLED);
    }

    /**
     * Gets the number of spaces to use for indentation of wrapped lines when
     * generating file.
     * @return number of spaces
     */
    public int getWrapIndentLength() {
        return PREFS.getInt(WRAP_INDENT_LENGTH);
    }

    /**
     * Gets whether to convert encoded strings to unicode characters when
     * reading file.
     * @return <code>true</code> if converting
     */
    public boolean isUnicodeUnescapeEnabled() {
        return PREFS.getBoolean(UNICODE_UNESCAPE_ENABLED);
    }

    /**
     * Gets whether to escape unicode characters when generating file.
     * @return <code>true</code> if escaping
     */
    public boolean isUnicodeEscapeEnabled() {
        return PREFS.getBoolean(UNICODE_ESCAPE_ENABLED);
    }
    /**
     * Gets whether escaped unicode "alpha" characters should be uppercase
     * when generating file. 
     * @return <code>true</code> if uppercase
     */
    public boolean isUnicodeEscapeUppercase() {
        return PREFS.getBoolean(UNICODE_ESCAPE_UPPERCASE);
    }

    /**
     * Gets whether we want to overwrite system (or Eclipse) default new line
     * type when generating file.
     * @return <code>true</code> if overwriting
     */
    public boolean getForceNewLineType() {
        return PREFS.getBoolean(FORCE_NEW_LINE_TYPE);
    }

    /**
     * Gets the new line type to use when overwriting system (or Eclipse)
     * default new line type when generating file.  Use constants to this
     * effect.
     * @return new line type
     */
    public int getNewLineStyle() {
        return PREFS.getInt(NEW_LINE_STYLE);
    }
    
    /**
     * Gets whether new lines are escaped or printed as is when generating file.
     * @return <code>true</code> if printed as is.
     */
    public boolean isNewLineNice() {
        return PREFS.getBoolean(NEW_LINE_NICE);
    }

    /**
     * Gets whether to report keys with missing values.
     * @return <code>true</code> if reporting
     */
    public boolean getReportMissingValues() {
        return PREFS.getBoolean(REPORT_MISSING_VALUES);
    }
    
    /**
     * Gets whether to report keys with duplicate values.
     * @return <code>true</code> if reporting
     */
    public boolean getReportDuplicateValues() {
        return PREFS.getBoolean(REPORT_DUPL_VALUES);
    }
    
    /**
     * Gets whether to report keys with similar values.
     * @return <code>true</code> if reporting
     */
    public boolean getReportSimilarValues() {
        return PREFS.getBoolean(REPORT_SIM_VALUES);
    }

    /**
     * Gets whether to use the "word compare" method when reporting similar
     * values.
     * @return <code>true</code> if using "word compare" method
     */
    public boolean getReportSimilarValuesWordCompare() {
        return PREFS.getBoolean(REPORT_SIM_VALUES_WORD_COMPARE);
    }

    /**
     * Gets whether to use the Levensthein method when reporting similar
     * values.
     * @return <code>true</code> if using Levensthein method
     */
    public boolean getReportSimilarValuesLevensthein() {
        return PREFS.getBoolean(REPORT_SIM_VALUES_LEVENSTHEIN);
    }

    /**
     * Gets the minimum precision level to use for determining when to report
     * similarities. 
     * @return precision
     */
    public double getReportSimilarValuesPrecision() {
        return PREFS.getDouble(REPORT_SIM_VALUES_PRECISION);
    }

    /**
     * Gets whether a tree shall be displayed within the editor or not.
     * @return <code>true</code> A tree shall not be displayed.
     */
    public boolean isEditorTreeHidden() {
        return PREFS.getBoolean(EDITOR_TREE_HIDDEN);
    }
    
    /**
     * Gets whether to keep empty fields.
     * @return <code>true</code> if empty fields are to be kept.
     */
    public boolean getKeepEmptyFields() {
        return PREFS.getBoolean(KEEP_EMPTY_FIELDS);
    }

}
