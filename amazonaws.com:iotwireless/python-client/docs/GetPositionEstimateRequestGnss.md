# GetPositionEstimateRequestGnss


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
from openapi_client.models.get_position_estimate_request_gnss import GetPositionEstimateRequestGnss

# TODO update the JSON string below
json = "{}"
# create an instance of GetPositionEstimateRequestGnss from a JSON string
get_position_estimate_request_gnss_instance = GetPositionEstimateRequestGnss.from_json(json)
# print the JSON string representation of the object
print(GetPositionEstimateRequestGnss.to_json())

# convert the object into a dict
get_position_estimate_request_gnss_dict = get_position_estimate_request_gnss_instance.to_dict()
# create an instance of GetPositionEstimateRequestGnss from a dict
get_position_estimate_request_gnss_from_dict = GetPositionEstimateRequestGnss.from_dict(get_position_estimate_request_gnss_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


