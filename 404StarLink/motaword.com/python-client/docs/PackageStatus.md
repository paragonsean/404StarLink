# PackageStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**PackageStatusEnum**](PackageStatusEnum.md) |  | [optional] 

## Example

```python
from openapi_client.models.package_status import PackageStatus

# TODO update the JSON string below
json = "{}"
# create an instance of PackageStatus from a JSON string
package_status_instance = PackageStatus.from_json(json)
# print the JSON string representation of the object
print(PackageStatus.to_json())

# convert the object into a dict
package_status_dict = package_status_instance.to_dict()
# create an instance of PackageStatus from a dict
package_status_from_dict = PackageStatus.from_dict(package_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


