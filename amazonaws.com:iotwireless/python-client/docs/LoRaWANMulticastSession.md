# LoRaWANMulticastSession

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
from openapi_client.models.lo_ra_wan_multicast_session import LoRaWANMulticastSession

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANMulticastSession from a JSON string
lo_ra_wan_multicast_session_instance = LoRaWANMulticastSession.from_json(json)
# print the JSON string representation of the object
print(LoRaWANMulticastSession.to_json())

# convert the object into a dict
lo_ra_wan_multicast_session_dict = lo_ra_wan_multicast_session_instance.to_dict()
# create an instance of LoRaWANMulticastSession from a dict
lo_ra_wan_multicast_session_from_dict = LoRaWANMulticastSession.from_dict(lo_ra_wan_multicast_session_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


