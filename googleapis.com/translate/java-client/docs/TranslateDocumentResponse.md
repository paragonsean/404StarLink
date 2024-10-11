

# TranslateDocumentResponse

A translated document response message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentTranslation** | [**DocumentTranslation**](DocumentTranslation.md) |  |  [optional] |
|**glossaryConfig** | [**TranslateTextGlossaryConfig**](TranslateTextGlossaryConfig.md) |  |  [optional] |
|**glossaryDocumentTranslation** | [**DocumentTranslation**](DocumentTranslation.md) |  |  [optional] |
|**model** | **String** | Only present when &#39;model&#39; is present in the request. &#39;model&#39; is normalized to have a project number. For example: If the &#39;model&#39; field in TranslateDocumentRequest is: &#x60;projects/{project-id}/locations/{location-id}/models/general/nmt&#x60; then &#x60;model&#x60; here would be normalized to &#x60;projects/{project-number}/locations/{location-id}/models/general/nmt&#x60;. |  [optional] |



