

# Translation

A single translation response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**detectedLanguageCode** | **String** | The BCP-47 language code of source text in the initial request, detected automatically, if no source language was passed within the initial request. If the source language was passed, auto-detection of the language does not occur and this field is empty. |  [optional] |
|**glossaryConfig** | [**TranslateTextGlossaryConfig**](TranslateTextGlossaryConfig.md) |  |  [optional] |
|**model** | **String** | Only present when &#x60;model&#x60; is present in the request. &#x60;model&#x60; here is normalized to have project number. For example: If the &#x60;model&#x60; requested in TranslationTextRequest is &#x60;projects/{project-id}/locations/{location-id}/models/general/nmt&#x60; then &#x60;model&#x60; here would be normalized to &#x60;projects/{project-number}/locations/{location-id}/models/general/nmt&#x60;. |  [optional] |
|**translatedText** | **String** | Text translated into the target language. If an error occurs during translation, this field might be excluded from the response. |  [optional] |



