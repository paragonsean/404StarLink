# GetWirelessGatewayFirmwareInformationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**GetWirelessGatewayFirmwareInformationResponseLoRaWAN**](GetWirelessGatewayFirmwareInformationResponseLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_gateway_firmware_information_response import GetWirelessGatewayFirmwareInformationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessGatewayFirmwareInformationResponse from a JSON string
get_wireless_gateway_firmware_information_response_instance = GetWirelessGatewayFirmwareInformationResponse.from_json(json)
# print the JSON string representation of the object
print(GetWirelessGatewayFirmwareInformationResponse.to_json())

# convert the object into a dict
get_wireless_gateway_firmware_information_response_dict = get_wireless_gateway_firmware_information_response_instance.to_dict()
# create an instance of GetWirelessGatewayFirmwareInformationResponse from a dict
get_wireless_gateway_firmware_information_response_from_dict = GetWirelessGatewayFirmwareInformationResponse.from_dict(get_wireless_gateway_firmware_information_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


