

# Documentation

A content string and a MIME type that describes the content string's format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | The body of the documentation, interpreted according to mime_type. The content may not exceed 8,192 Unicode characters and may not exceed more than 10,240 bytes when encoded in UTF-8 format, whichever is smaller. This text can be templatized by using variables (https://cloud.google.com/monitoring/alerts/doc-variables). |  [optional] |
|**mimeType** | **String** | The format of the content field. Presently, only the value \&quot;text/markdown\&quot; is supported. See Markdown (https://en.wikipedia.org/wiki/Markdown) for more information. |  [optional] |



