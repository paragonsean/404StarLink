# HopDestination

Optional. Configuration for a destination queue to which the job can hop once a customer-defined minimum wait time has passed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priority** | **int** |  | [optional] 
**queue** | **str** |  | [optional] 
**wait_minutes** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.hop_destination import HopDestination

# TODO update the JSON string below
json = "{}"
# create an instance of HopDestination from a JSON string
hop_destination_instance = HopDestination.from_json(json)
# print the JSON string representation of the object
print(HopDestination.to_json())

# convert the object into a dict
hop_destination_dict = hop_destination_instance.to_dict()
# create an instance of HopDestination from a dict
hop_destination_from_dict = HopDestination.from_dict(hop_destination_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


