

# CloudInterconnectEgressWorkload

The interconnect egress only includes the Interconnect Egress. Please use the standard egress traffic interface to specify your standard egress usage.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**egressRate** | [**Usage**](Usage.md) |  |  [optional] |
|**interconnectConnectionLocation** | [**InterconnectConnectionLocationEnum**](#InterconnectConnectionLocationEnum) | Locations in the [Interconnect connection location table](https://cloud.google.com/vpc/network-pricing#interconnect-pricing). This is the interconnect egress charges. |  [optional] |



## Enum: InterconnectConnectionLocationEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;INTERCONNECT_CONNECTION_LOCATION_UNSPECIFIED&quot; |
| ASIA | &quot;INTERCONNECT_CONNECTION_LOCATION_ASIA&quot; |
| EUROPE | &quot;INTERCONNECT_CONNECTION_LOCATION_EUROPE&quot; |
| NORTH_AMERICA | &quot;INTERCONNECT_CONNECTION_LOCATION_NORTH_AMERICA&quot; |
| SOUTH_AMERICA | &quot;INTERCONNECT_CONNECTION_LOCATION_SOUTH_AMERICA&quot; |
| AUSTRALIA | &quot;INTERCONNECT_CONNECTION_LOCATION_AUSTRALIA&quot; |



