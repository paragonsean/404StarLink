# Roaming


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roaming_country_code** | **str** |  | [optional] 
**roaming_network_code** | **str** |  | [optional] 
**roaming_network_name** | **str** |  | [optional] 
**status** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.roaming import Roaming

# TODO update the JSON string below
json = "{}"
# create an instance of Roaming from a JSON string
roaming_instance = Roaming.from_json(json)
# print the JSON string representation of the object
print(Roaming.to_json())

# convert the object into a dict
roaming_dict = roaming_instance.to_dict()
# create an instance of Roaming from a dict
roaming_from_dict = Roaming.from_dict(roaming_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


