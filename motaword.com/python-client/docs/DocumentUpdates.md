# DocumentUpdates


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documents** | **List[bytearray]** | You can add as many files as you want in documents[] parameter. | [optional] 
**schemes** | **str** | JSON string. If your documents have a scheme, as in cases of CSV files, use the same array index keys for &#x60;schemes&#x60; parameter to specify their schemes. See &#x60;Document Schemes&#x60; title in the API documentation. | [optional] 
**source_links** | [**List[LinkedSourceDocument]**](LinkedSourceDocument.md) | When provided, we will download the files from these URLs, in addition to files provded in &#x60;documents&#x60; parameter and then save as source documents | [optional] 

## Example

```python
from openapi_client.models.document_updates import DocumentUpdates

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentUpdates from a JSON string
document_updates_instance = DocumentUpdates.from_json(json)
# print the JSON string representation of the object
print(DocumentUpdates.to_json())

# convert the object into a dict
document_updates_dict = document_updates_instance.to_dict()
# create an instance of DocumentUpdates from a dict
document_updates_from_dict = DocumentUpdates.from_dict(document_updates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


