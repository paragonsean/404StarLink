# CreateMulticastGroupRequestLoRaWAN

The LoRaWAN information that is to be used with the multicast group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rf_region** | [**SupportedRfRegion**](SupportedRfRegion.md) |  | [optional] 
**dl_class** | [**DlClass**](DlClass.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_multicast_group_request_lo_ra_wan import CreateMulticastGroupRequestLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of CreateMulticastGroupRequestLoRaWAN from a JSON string
create_multicast_group_request_lo_ra_wan_instance = CreateMulticastGroupRequestLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(CreateMulticastGroupRequestLoRaWAN.to_json())

# convert the object into a dict
create_multicast_group_request_lo_ra_wan_dict = create_multicast_group_request_lo_ra_wan_instance.to_dict()
# create an instance of CreateMulticastGroupRequestLoRaWAN from a dict
create_multicast_group_request_lo_ra_wan_from_dict = CreateMulticastGroupRequestLoRaWAN.from_dict(create_multicast_group_request_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


