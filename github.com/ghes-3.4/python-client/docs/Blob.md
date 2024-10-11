# Blob

Blob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** |  | 
**encoding** | **str** |  | 
**highlighted_content** | **str** |  | [optional] 
**node_id** | **str** |  | 
**sha** | **str** |  | 
**size** | **int** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.blob import Blob

# TODO update the JSON string below
json = "{}"
# create an instance of Blob from a JSON string
blob_instance = Blob.from_json(json)
# print the JSON string representation of the object
print(Blob.to_json())

# convert the object into a dict
blob_dict = blob_instance.to_dict()
# create an instance of Blob from a dict
blob_from_dict = Blob.from_dict(blob_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


