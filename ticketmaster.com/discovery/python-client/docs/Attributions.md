# Attributions

Attributions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | [**Attribution**](Attribution.md) |  | [optional] 
**descriptions** | [**Dict[str, Attribution]**](Attribution.md) | Attribution descriptions - multi-lingual fields | [optional] 

## Example

```python
from openapi_client.models.attributions import Attributions

# TODO update the JSON string below
json = "{}"
# create an instance of Attributions from a JSON string
attributions_instance = Attributions.from_json(json)
# print the JSON string representation of the object
print(Attributions.to_json())

# convert the object into a dict
attributions_dict = attributions_instance.to_dict()
# create an instance of Attributions from a dict
attributions_from_dict = Attributions.from_dict(attributions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


