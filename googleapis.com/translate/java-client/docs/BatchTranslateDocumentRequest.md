

# BatchTranslateDocumentRequest

The BatchTranslateDocument request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customizedAttribution** | **String** | Optional. This flag is to support user customized attribution. If not provided, the default is &#x60;Machine Translated by Google&#x60;. Customized attribution should follow rules in https://cloud.google.com/translate/attribution#attribution_and_logos |  [optional] |
|**enableShadowRemovalNativePdf** | **Boolean** | Optional. If true, use the text removal server to remove the shadow text on background image for native pdf translation. Shadow removal feature can only be enabled when is_translate_native_pdf_only: false &amp;&amp; pdf_native_only: false |  [optional] |
|**formatConversions** | **Map&lt;String, String&gt;** | Optional. |  [optional] |
|**glossaries** | [**Map&lt;String, TranslateTextGlossaryConfig&gt;**](TranslateTextGlossaryConfig.md) | Optional. Glossaries to be applied. It&#39;s keyed by target language code. |  [optional] |
|**inputConfigs** | [**List&lt;BatchDocumentInputConfig&gt;**](BatchDocumentInputConfig.md) | Required. Input configurations. The total number of files matched should be &lt;&#x3D; 100. The total content size to translate should be &lt;&#x3D; 100M Unicode codepoints. The files must use UTF-8 encoding. |  [optional] |
|**models** | **Map&lt;String, String&gt;** | Optional. The models to use for translation. Map&#39;s key is target language code. Map&#39;s value is the model name. Value can be a built-in general model, or an AutoML Translation model. The value format depends on model type: - AutoML Translation models: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/{model-id}&#x60; - General (built-in) models: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/general/nmt&#x60;, If the map is empty or a specific model is not requested for a language pair, then default google model (nmt) is used. |  [optional] |
|**outputConfig** | [**BatchDocumentOutputConfig**](BatchDocumentOutputConfig.md) |  |  [optional] |
|**sourceLanguageCode** | **String** | Required. The BCP-47 language code of the input document if known, for example, \&quot;en-US\&quot; or \&quot;sr-Latn\&quot;. Supported language codes are listed in [Language Support](https://cloud.google.com/translate/docs/languages). |  [optional] |
|**targetLanguageCodes** | **List&lt;String&gt;** | Required. The BCP-47 language code to use for translation of the input document. Specify up to 10 language codes here. |  [optional] |



