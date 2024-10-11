

# DetectLanguageRequest

The request message for language detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | The content of the input stored as a string. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See https://cloud.google.com/translate/docs/labels for more information. |  [optional] |
|**mimeType** | **String** | Optional. The format of the source text, for example, \&quot;text/html\&quot;, \&quot;text/plain\&quot;. If left blank, the MIME type defaults to \&quot;text/html\&quot;. |  [optional] |
|**model** | **String** | Optional. The language detection model to be used. Format: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/language-detection/{model-id}&#x60; Only one language detection model is currently supported: &#x60;projects/{project-number-or-id}/locations/{location-id}/models/language-detection/default&#x60;. If not specified, the default model is used. |  [optional] |



