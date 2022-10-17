# ExtendedDataServices

If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what MediaConvert does with the Extended Data Services (XDS) packets. You can choose to pass through XDS packets, or remove them from the output. For more information about XDS, see EIA-608 Line Data Services, section 9.5.1.5 05h Content Advisory.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**copy_protection_action** | [**CopyProtectionAction**](CopyProtectionAction.md) |  | [optional] 
**vchip_action** | [**VchipAction**](VchipAction.md) |  | [optional] 

## Example

```python
from openapi_client.models.extended_data_services import ExtendedDataServices

# TODO update the JSON string below
json = "{}"
# create an instance of ExtendedDataServices from a JSON string
extended_data_services_instance = ExtendedDataServices.from_json(json)
# print the JSON string representation of the object
print(ExtendedDataServices.to_json())

# convert the object into a dict
extended_data_services_dict = extended_data_services_instance.to_dict()
# create an instance of ExtendedDataServices from a dict
extended_data_services_from_dict = ExtendedDataServices.from_dict(extended_data_services_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


