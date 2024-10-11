# Attachment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The document in Base64-encoded string format. | 
**content_type** | **str** | The file format.   Possible values: **application/pdf**, **image/jpg**, **image/jpeg**, **image/png**.  | [optional] 
**filename** | **str** | The name of the file including the file extension. | [optional] 
**page_name** | **str** | The name of the file including the file extension. | [optional] 
**page_type** | **str** | Specifies which side of the ID card is uploaded.  * When &#x60;type&#x60; is **driversLicense** or **identityCard**, set this to **front** or **back**.  * When omitted, we infer the page number based on the order of attachments. | [optional] 

## Example

```python
from openapi_client.models.attachment import Attachment

# TODO update the JSON string below
json = "{}"
# create an instance of Attachment from a JSON string
attachment_instance = Attachment.from_json(json)
# print the JSON string representation of the object
print(Attachment.to_json())

# convert the object into a dict
attachment_dict = attachment_instance.to_dict()
# create an instance of Attachment from a dict
attachment_from_dict = Attachment.from_dict(attachment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


