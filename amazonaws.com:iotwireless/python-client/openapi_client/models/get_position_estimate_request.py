# coding: utf-8

"""
    AWS IoT Wireless

    <p>AWS IoT Wireless provides bi-directional communication between internet-connected wireless devices and the AWS Cloud. To onboard both LoRaWAN and Sidewalk devices to AWS IoT, use the IoT Wireless API. These wireless devices use the Low Power Wide Area Networking (LPWAN) communication protocol to communicate with AWS IoT.</p> <p>Using the API, you can perform create, read, update, and delete operations for your wireless devices, gateways, destinations, and profiles. After onboarding your devices, you can use the API operations to set log levels and monitor your devices with CloudWatch.</p> <p>You can also use the API operations to create multicast groups and schedule a multicast session for sending a downlink message to devices in the group. By using Firmware Updates Over-The-Air (FUOTA) API operations, you can create a FUOTA task and schedule a session to update the firmware of individual devices or an entire group of devices in a multicast group.</p>

    The version of the OpenAPI document: 2020-11-22
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.get_position_estimate_request_cell_towers import GetPositionEstimateRequestCellTowers
from openapi_client.models.get_position_estimate_request_gnss import GetPositionEstimateRequestGnss
from openapi_client.models.get_position_estimate_request_ip import GetPositionEstimateRequestIp
from openapi_client.models.wi_fi_access_point import WiFiAccessPoint
from typing import Optional, Set
from typing_extensions import Self

class GetPositionEstimateRequest(BaseModel):
    """
    GetPositionEstimateRequest
    """ # noqa: E501
    wi_fi_access_points: Optional[List[WiFiAccessPoint]] = Field(default=None, description="Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using HERE's Wi-Fi based solver.", alias="WiFiAccessPoints")
    cell_towers: Optional[GetPositionEstimateRequestCellTowers] = Field(default=None, alias="CellTowers")
    ip: Optional[GetPositionEstimateRequestIp] = Field(default=None, alias="Ip")
    gnss: Optional[GetPositionEstimateRequestGnss] = Field(default=None, alias="Gnss")
    timestamp: Optional[datetime] = Field(default=None, description="Optional information that specifies the time when the position information will be resolved. It uses the Unix timestamp format. If not specified, the time at which the request was received will be used.", alias="Timestamp")
    __properties: ClassVar[List[str]] = ["WiFiAccessPoints", "CellTowers", "Ip", "Gnss", "Timestamp"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of GetPositionEstimateRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in wi_fi_access_points (list)
        _items = []
        if self.wi_fi_access_points:
            for _item_wi_fi_access_points in self.wi_fi_access_points:
                if _item_wi_fi_access_points:
                    _items.append(_item_wi_fi_access_points.to_dict())
            _dict['WiFiAccessPoints'] = _items
        # override the default output from pydantic by calling `to_dict()` of cell_towers
        if self.cell_towers:
            _dict['CellTowers'] = self.cell_towers.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ip
        if self.ip:
            _dict['Ip'] = self.ip.to_dict()
        # override the default output from pydantic by calling `to_dict()` of gnss
        if self.gnss:
            _dict['Gnss'] = self.gnss.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of GetPositionEstimateRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "WiFiAccessPoints": [WiFiAccessPoint.from_dict(_item) for _item in obj["WiFiAccessPoints"]] if obj.get("WiFiAccessPoints") is not None else None,
            "CellTowers": GetPositionEstimateRequestCellTowers.from_dict(obj["CellTowers"]) if obj.get("CellTowers") is not None else None,
            "Ip": GetPositionEstimateRequestIp.from_dict(obj["Ip"]) if obj.get("Ip") is not None else None,
            "Gnss": GetPositionEstimateRequestGnss.from_dict(obj["Gnss"]) if obj.get("Gnss") is not None else None,
            "Timestamp": obj.get("Timestamp")
        })
        return _obj


