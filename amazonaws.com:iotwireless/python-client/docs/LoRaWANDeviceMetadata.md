# LoRaWANDeviceMetadata

LoRaWAN device metatdata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dev_eui** | **str** |  | [optional] 
**f_port** | **int** |  | [optional] 
**data_rate** | **int** |  | [optional] 
**frequency** | **int** |  | [optional] 
**timestamp** | **str** |  | [optional] 
**gateways** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_device_metadata import LoRaWANDeviceMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANDeviceMetadata from a JSON string
lo_ra_wan_device_metadata_instance = LoRaWANDeviceMetadata.from_json(json)
# print the JSON string representation of the object
print(LoRaWANDeviceMetadata.to_json())

# convert the object into a dict
lo_ra_wan_device_metadata_dict = lo_ra_wan_device_metadata_instance.to_dict()
# create an instance of LoRaWANDeviceMetadata from a dict
lo_ra_wan_device_metadata_from_dict = LoRaWANDeviceMetadata.from_dict(lo_ra_wan_device_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


