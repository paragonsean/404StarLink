

# DocumentInputConfig

A document translation request input config.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **byte[]** | Document&#39;s content represented as a stream of bytes. |  [optional] |
|**gcsSource** | [**GcsSource**](GcsSource.md) |  |  [optional] |
|**mimeType** | **String** | Specifies the input document&#39;s mime_type. If not specified it will be determined using the file extension for gcs_source provided files. For a file provided through bytes content the mime_type must be provided. Currently supported mime types are: - application/pdf - application/vnd.openxmlformats-officedocument.wordprocessingml.document - application/vnd.openxmlformats-officedocument.presentationml.presentation - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet |  [optional] |



