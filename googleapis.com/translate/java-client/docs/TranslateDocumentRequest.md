

# TranslateDocumentRequest

A document translation request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customizedAttribution** | **String** | Optional. This flag is to support user customized attribution. If not provided, the default is &#x60;Machine Translated by Google&#x60;. Customized attribution should follow rules in https://cloud.google.com/translate/attribution#attribution_and_logos |  [optional] |
|**documentInputConfig** | [**DocumentInputConfig**](DocumentInputConfig.md) |  |  [optional] |
|**documentOutputConfig** | [**DocumentOutputConfig**](DocumentOutputConfig.md) |  |  [optional] |
|**enableRotationCorrection** | **Boolean** | Optional. If true, enable auto rotation correction in DVS. |  [optional] |
|**enableShadowRemovalNativePdf** | **Boolean** | Optional. If true, use the text removal server to remove the shadow text on background image for native pdf translation. Shadow removal feature can only be enabled when is_translate_native_pdf_only: false &amp;&amp; pdf_native_only: false |  [optional] |
|**glossaryConfig** | [**TranslateTextGlossaryConfig**](TranslateTextGlossaryConfig.md) |  |  [optional] |
|**isTranslateNativePdfOnly** | **Boolean** | Optional. is_translate_native_pdf_only field for external customers. If true, the page limit of online native pdf translation is 300 and only native pdf pages will be translated. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See https://cloud.google.com/translate/docs/advanced/labels for more information. |  [optional] |
|**model** | **String** | Optional. The &#x60;model&#x60; type requested for this translation. The format depends on model type: - AutoML Translation models: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/{model-id}&#x60; - General (built-in) models: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/general/nmt&#x60;, If not provided, the default Google model (NMT) will be used for translation. |  [optional] |
|**sourceLanguageCode** | **String** | Optional. The BCP-47 language code of the input document if known, for example, \&quot;en-US\&quot; or \&quot;sr-Latn\&quot;. Supported language codes are listed in Language Support. If the source language isn&#39;t specified, the API attempts to identify the source language automatically and returns the source language within the response. Source language must be specified if the request contains a glossary or a custom model. |  [optional] |
|**targetLanguageCode** | **String** | Required. The BCP-47 language code to use for translation of the input document, set to one of the language codes listed in Language Support. |  [optional] |



