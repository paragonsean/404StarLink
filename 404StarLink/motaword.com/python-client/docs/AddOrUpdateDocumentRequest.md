# AddOrUpdateDocumentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document** | [**FileAsData**](FileAsData.md) |  | [optional] 

## Example

```python
from openapi_client.models.add_or_update_document_request import AddOrUpdateDocumentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AddOrUpdateDocumentRequest from a JSON string
add_or_update_document_request_instance = AddOrUpdateDocumentRequest.from_json(json)
# print the JSON string representation of the object
print(AddOrUpdateDocumentRequest.to_json())

# convert the object into a dict
add_or_update_document_request_dict = add_or_update_document_request_instance.to_dict()
# create an instance of AddOrUpdateDocumentRequest from a dict
add_or_update_document_request_from_dict = AddOrUpdateDocumentRequest.from_dict(add_or_update_document_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


