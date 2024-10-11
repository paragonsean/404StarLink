# StartMulticastGroupSessionRequestLoRaWAN

The LoRaWAN information used with the multicast session.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dl_dr** | **int** | Downlink data rate. | [optional] 
**dl_freq** | **int** | Downlink frequency. | [optional] 
**session_start_time** | **datetime** | Timestamp of when the multicast group session is to start. | [optional] 
**session_timeout** | **int** | How long before a multicast group session is to timeout. | [optional] 
**ping_slot_period** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.start_multicast_group_session_request_lo_ra_wan import StartMulticastGroupSessionRequestLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of StartMulticastGroupSessionRequestLoRaWAN from a JSON string
start_multicast_group_session_request_lo_ra_wan_instance = StartMulticastGroupSessionRequestLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(StartMulticastGroupSessionRequestLoRaWAN.to_json())

# convert the object into a dict
start_multicast_group_session_request_lo_ra_wan_dict = start_multicast_group_session_request_lo_ra_wan_instance.to_dict()
# create an instance of StartMulticastGroupSessionRequestLoRaWAN from a dict
start_multicast_group_session_request_lo_ra_wan_from_dict = StartMulticastGroupSessionRequestLoRaWAN.from_dict(start_multicast_group_session_request_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


