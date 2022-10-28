# DrivingLicenseSchemaIssuedByOrganizationAddress


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** |  | 
**district** | **str** |  | 
**house** | **str** |  | 
**landmark** | **str** |  | 
**line1** | **str** |  | 
**line2** | **str** |  | 
**locality** | **str** |  | 
**pin** | **str** |  | 
**state** | **str** |  | 
**type** | **str** |  | 
**vtc** | **str** |  | 

## Example

```python
from openapi_client.models.driving_license_schema_issued_by_organization_address import DrivingLicenseSchemaIssuedByOrganizationAddress

# TODO update the JSON string below
json = "{}"
# create an instance of DrivingLicenseSchemaIssuedByOrganizationAddress from a JSON string
driving_license_schema_issued_by_organization_address_instance = DrivingLicenseSchemaIssuedByOrganizationAddress.from_json(json)
# print the JSON string representation of the object
print(DrivingLicenseSchemaIssuedByOrganizationAddress.to_json())

# convert the object into a dict
driving_license_schema_issued_by_organization_address_dict = driving_license_schema_issued_by_organization_address_instance.to_dict()
# create an instance of DrivingLicenseSchemaIssuedByOrganizationAddress from a dict
driving_license_schema_issued_by_organization_address_from_dict = DrivingLicenseSchemaIssuedByOrganizationAddress.from_dict(driving_license_schema_issued_by_organization_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


