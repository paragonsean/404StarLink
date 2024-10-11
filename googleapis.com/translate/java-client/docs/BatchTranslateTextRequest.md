

# BatchTranslateTextRequest

The batch translation request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**glossaries** | [**Map&lt;String, TranslateTextGlossaryConfig&gt;**](TranslateTextGlossaryConfig.md) | Optional. Glossaries to be applied for translation. It&#39;s keyed by target language code. |  [optional] |
|**inputConfigs** | [**List&lt;InputConfig&gt;**](InputConfig.md) | Required. Input configurations. The total number of files matched should be &lt;&#x3D; 100. The total content size should be &lt;&#x3D; 100M Unicode codepoints. The files must use UTF-8 encoding. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See https://cloud.google.com/translate/docs/labels for more information. |  [optional] |
|**models** | **Map&lt;String, String&gt;** | Optional. The models to use for translation. Map&#39;s key is target language code. Map&#39;s value is model name. Value can be a built-in general model, or an AutoML Translation model. The value format depends on model type: - AutoML Translation models: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/{model-id}&#x60; - General (built-in) models: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/general/nmt&#x60;, If the map is empty or a specific model is not requested for a language pair, then default google model (nmt) is used. |  [optional] |
|**outputConfig** | [**OutputConfig**](OutputConfig.md) |  |  [optional] |
|**sourceLanguageCode** | **String** | Required. Source language code. |  [optional] |
|**targetLanguageCodes** | **List&lt;String&gt;** | Required. Specify up to 10 language codes here. |  [optional] |



