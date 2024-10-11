# GetServiceProfileResponseLoRaWAN


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ul_rate** | **int** |  | [optional] 
**ul_bucket_size** | **int** |  | [optional] 
**ul_rate_policy** | **str** |  | [optional] 
**dl_rate** | **int** |  | [optional] 
**dl_bucket_size** | **int** |  | [optional] 
**dl_rate_policy** | **str** |  | [optional] 
**add_gw_metadata** | **bool** |  | [optional] 
**dev_status_req_freq** | **int** |  | [optional] 
**report_dev_status_battery** | **bool** |  | [optional] 
**report_dev_status_margin** | **bool** |  | [optional] 
**dr_min** | **int** |  | [optional] 
**dr_max** | **int** |  | [optional] 
**channel_mask** | **str** |  | [optional] 
**pr_allowed** | **bool** |  | [optional] 
**hr_allowed** | **bool** |  | [optional] 
**ra_allowed** | **bool** |  | [optional] 
**nwk_geo_loc** | **bool** |  | [optional] 
**target_per** | **int** |  | [optional] 
**min_gw_diversity** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.get_service_profile_response_lo_ra_wan import GetServiceProfileResponseLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of GetServiceProfileResponseLoRaWAN from a JSON string
get_service_profile_response_lo_ra_wan_instance = GetServiceProfileResponseLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(GetServiceProfileResponseLoRaWAN.to_json())

# convert the object into a dict
get_service_profile_response_lo_ra_wan_dict = get_service_profile_response_lo_ra_wan_instance.to_dict()
# create an instance of GetServiceProfileResponseLoRaWAN from a dict
get_service_profile_response_lo_ra_wan_from_dict = GetServiceProfileResponseLoRaWAN.from_dict(get_service_profile_response_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


