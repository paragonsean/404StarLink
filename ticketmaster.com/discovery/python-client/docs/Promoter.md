# Promoter

Promoter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Description of the promoter | [optional] 
**id** | **str** | Id of the promoter | [optional] 
**name** | **str** | Name of the promoter | [optional] 

## Example

```python
from openapi_client.models.promoter import Promoter

# TODO update the JSON string below
json = "{}"
# create an instance of Promoter from a JSON string
promoter_instance = Promoter.from_json(json)
# print the JSON string representation of the object
print(Promoter.to_json())

# convert the object into a dict
promoter_dict = promoter_instance.to_dict()
# create an instance of Promoter from a dict
promoter_from_dict = Promoter.from_dict(promoter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


