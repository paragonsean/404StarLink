# GetWirelessGatewayCertificateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iot_certificate_id** | **str** |  | [optional] 
**lo_ra_wan_network_server_certificate_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_gateway_certificate_response import GetWirelessGatewayCertificateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessGatewayCertificateResponse from a JSON string
get_wireless_gateway_certificate_response_instance = GetWirelessGatewayCertificateResponse.from_json(json)
# print the JSON string representation of the object
print(GetWirelessGatewayCertificateResponse.to_json())

# convert the object into a dict
get_wireless_gateway_certificate_response_dict = get_wireless_gateway_certificate_response_instance.to_dict()
# create an instance of GetWirelessGatewayCertificateResponse from a dict
get_wireless_gateway_certificate_response_from_dict = GetWirelessGatewayCertificateResponse.from_dict(get_wireless_gateway_certificate_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


