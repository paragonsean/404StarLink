

# DocumentTranslation

A translated document message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**byteStreamOutputs** | **List&lt;byte[]&gt;** | The array of translated documents. It is expected to be size 1 for now. We may produce multiple translated documents in the future for other type of file formats. |  [optional] |
|**detectedLanguageCode** | **String** | The detected language for the input document. If the user did not provide the source language for the input document, this field will have the language code automatically detected. If the source language was passed, auto-detection of the language does not occur and this field is empty. |  [optional] |
|**mimeType** | **String** | The translated document&#39;s mime type. |  [optional] |



