# Mnp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** |  | [optional] 
**international_formatted** | **str** |  | [optional] 
**is_ported** | **bool** |  | [optional] 
**mccmnc** | **str** |  | [optional] 
**national_format** | **str** |  | [optional] 
**network** | **str** |  | [optional] 
**number** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.mnp import Mnp

# TODO update the JSON string below
json = "{}"
# create an instance of Mnp from a JSON string
mnp_instance = Mnp.from_json(json)
# print the JSON string representation of the object
print(Mnp.to_json())

# convert the object into a dict
mnp_dict = mnp_instance.to_dict()
# create an instance of Mnp from a dict
mnp_from_dict = Mnp.from_dict(mnp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


