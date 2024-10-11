

# DocumentOutputConfig

A document translation request output config.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gcsDestination** | [**GcsDestination**](GcsDestination.md) |  |  [optional] |
|**mimeType** | **String** | Optional. Specifies the translated document&#39;s mime_type. If not specified, the translated file&#39;s mime type will be the same as the input file&#39;s mime type. Currently only support the output mime type to be the same as input mime type. - application/pdf - application/vnd.openxmlformats-officedocument.wordprocessingml.document - application/vnd.openxmlformats-officedocument.presentationml.presentation - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet |  [optional] |



