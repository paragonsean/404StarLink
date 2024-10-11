# MaintenanceStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connection_services** | [**List[MaintenanceStatusConnectionServicesInner]**](MaintenanceStatusConnectionServicesInner.md) |  | [optional] 
**scheduled_time** | **str** |  | [optional] 
**status** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.maintenance_status import MaintenanceStatus

# TODO update the JSON string below
json = "{}"
# create an instance of MaintenanceStatus from a JSON string
maintenance_status_instance = MaintenanceStatus.from_json(json)
# print the JSON string representation of the object
print(MaintenanceStatus.to_json())

# convert the object into a dict
maintenance_status_dict = maintenance_status_instance.to_dict()
# create an instance of MaintenanceStatus from a dict
maintenance_status_from_dict = MaintenanceStatus.from_dict(maintenance_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


