# GetDeviceProfileResponseLoRaWAN


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supports_class_b** | **bool** |  | [optional] 
**class_b_timeout** | **int** |  | [optional] 
**ping_slot_period** | **int** |  | [optional] 
**ping_slot_dr** | **int** |  | [optional] 
**ping_slot_freq** | **int** |  | [optional] 
**supports_class_c** | **bool** |  | [optional] 
**class_c_timeout** | **int** |  | [optional] 
**mac_version** | **str** |  | [optional] 
**reg_params_revision** | **str** |  | [optional] 
**rx_delay1** | **int** |  | [optional] 
**rx_dr_offset1** | **int** |  | [optional] 
**rx_data_rate2** | **int** |  | [optional] 
**rx_freq2** | **int** |  | [optional] 
**factory_preset_freqs_list** | **List** |  | [optional] 
**max_eirp** | **int** |  | [optional] 
**max_duty_cycle** | **int** |  | [optional] 
**rf_region** | **str** |  | [optional] 
**supports_join** | **bool** |  | [optional] 
**supports32_bit_f_cnt** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.get_device_profile_response_lo_ra_wan import GetDeviceProfileResponseLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of GetDeviceProfileResponseLoRaWAN from a JSON string
get_device_profile_response_lo_ra_wan_instance = GetDeviceProfileResponseLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(GetDeviceProfileResponseLoRaWAN.to_json())

# convert the object into a dict
get_device_profile_response_lo_ra_wan_dict = get_device_profile_response_lo_ra_wan_instance.to_dict()
# create an instance of GetDeviceProfileResponseLoRaWAN from a dict
get_device_profile_response_lo_ra_wan_from_dict = GetDeviceProfileResponseLoRaWAN.from_dict(get_device_profile_response_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


