# GetPositionEstimateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wi_fi_access_points** | [**List[WiFiAccessPoint]**](WiFiAccessPoint.md) | Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using HERE&#39;s Wi-Fi based solver. | [optional] 
**cell_towers** | [**GetPositionEstimateRequestCellTowers**](GetPositionEstimateRequestCellTowers.md) |  | [optional] 
**ip** | [**GetPositionEstimateRequestIp**](GetPositionEstimateRequestIp.md) |  | [optional] 
**gnss** | [**GetPositionEstimateRequestGnss**](GetPositionEstimateRequestGnss.md) |  | [optional] 
**timestamp** | **datetime** | Optional information that specifies the time when the position information will be resolved. It uses the Unix timestamp format. If not specified, the time at which the request was received will be used. | [optional] 

## Example

```python
from openapi_client.models.get_position_estimate_request import GetPositionEstimateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetPositionEstimateRequest from a JSON string
get_position_estimate_request_instance = GetPositionEstimateRequest.from_json(json)
# print the JSON string representation of the object
print(GetPositionEstimateRequest.to_json())

# convert the object into a dict
get_position_estimate_request_dict = get_position_estimate_request_instance.to_dict()
# create an instance of GetPositionEstimateRequest from a dict
get_position_estimate_request_from_dict = GetPositionEstimateRequest.from_dict(get_position_estimate_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


