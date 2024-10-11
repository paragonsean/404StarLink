

# TranslateTextRequest

The request message for synchronous translation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contents** | **List&lt;String&gt;** | Required. The content of the input in string format. We recommend the total content be less than 30k codepoints. The max length of this field is 1024. Use BatchTranslateText for larger text. |  [optional] |
|**glossaryConfig** | [**TranslateTextGlossaryConfig**](TranslateTextGlossaryConfig.md) |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See https://cloud.google.com/translate/docs/labels for more information. |  [optional] |
|**mimeType** | **String** | Optional. The format of the source text, for example, \&quot;text/html\&quot;, \&quot;text/plain\&quot;. If left blank, the MIME type defaults to \&quot;text/html\&quot;. |  [optional] |
|**model** | **String** | Optional. The &#x60;model&#x60; type requested for this translation. The format depends on model type: - AutoML Translation models: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/{model-id}&#x60; - General (built-in) models: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/general/nmt&#x60;, For global (non-regionalized) requests, use &#x60;location-id&#x60; &#x60;global&#x60;. For example, &#x60;projects/{project-number-or-id}/locations/global/models/general/nmt&#x60;. If not provided, the default Google model (NMT) will be used |  [optional] |
|**sourceLanguageCode** | **String** | Optional. The BCP-47 language code of the input text if known, for example, \&quot;en-US\&quot; or \&quot;sr-Latn\&quot;. Supported language codes are listed in Language Support. If the source language isn&#39;t specified, the API attempts to identify the source language automatically and returns the source language within the response. |  [optional] |
|**targetLanguageCode** | **String** | Required. The BCP-47 language code to use for translation of the input text, set to one of the language codes listed in Language Support. |  [optional] |



