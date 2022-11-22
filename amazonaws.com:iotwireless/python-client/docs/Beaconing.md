# Beaconing

Beaconing parameters for configuring the wireless gateways.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_rate** | **int** |  | [optional] 
**frequencies** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.beaconing import Beaconing

# TODO update the JSON string below
json = "{}"
# create an instance of Beaconing from a JSON string
beaconing_instance = Beaconing.from_json(json)
# print the JSON string representation of the object
print(Beaconing.to_json())

# convert the object into a dict
beaconing_dict = beaconing_instance.to_dict()
# create an instance of Beaconing from a dict
beaconing_from_dict = Beaconing.from_dict(beaconing_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


