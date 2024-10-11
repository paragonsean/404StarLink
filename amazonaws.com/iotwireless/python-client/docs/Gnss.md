# Gnss

Global navigation satellite system (GNSS) object used for positioning.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payload** | **str** |  | 
**capture_time** | **float** |  | [optional] 
**capture_time_accuracy** | **float** |  | [optional] 
**assist_position** | **List** |  | [optional] 
**assist_altitude** | **float** |  | [optional] 
**use2_d_solver** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.gnss import Gnss

# TODO update the JSON string below
json = "{}"
# create an instance of Gnss from a JSON string
gnss_instance = Gnss.from_json(json)
# print the JSON string representation of the object
print(Gnss.to_json())

# convert the object into a dict
gnss_dict = gnss_instance.to_dict()
# create an instance of Gnss from a dict
gnss_from_dict = Gnss.from_dict(gnss_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


