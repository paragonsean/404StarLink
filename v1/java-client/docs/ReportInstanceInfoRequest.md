

# ReportInstanceInfoRequest

Request for notebook instances to report information to Notebooks API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | **Map&lt;String, String&gt;** | The metadata reported to Notebooks API. This will be merged to the instance metadata store |  [optional] |
|**vmId** | **String** | Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity |  [optional] |



