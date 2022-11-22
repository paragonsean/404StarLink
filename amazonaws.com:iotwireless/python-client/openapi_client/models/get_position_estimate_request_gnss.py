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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.bool import bool
from openapi_client.models.float import float
from openapi_client.models.list import List
from openapi_client.models.str import str
from typing import Optional, Set
from typing_extensions import Self

class GetPositionEstimateRequestGnss(BaseModel):
    """
    GetPositionEstimateRequestGnss
    """ # noqa: E501
    payload: Any = Field(alias="Payload")
    capture_time: Optional[Any] = Field(default=None, alias="CaptureTime")
    capture_time_accuracy: Optional[Any] = Field(default=None, alias="CaptureTimeAccuracy")
    assist_position: Optional[Any] = Field(default=None, alias="AssistPosition")
    assist_altitude: Optional[Any] = Field(default=None, alias="AssistAltitude")
    use2_d_solver: Optional[Any] = Field(default=None, alias="Use2DSolver")
    __properties: ClassVar[List[str]] = ["Payload", "CaptureTime", "CaptureTimeAccuracy", "AssistPosition", "AssistAltitude", "Use2DSolver"]

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
        """Create an instance of GetPositionEstimateRequestGnss from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of GetPositionEstimateRequestGnss from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Payload": obj.get("Payload"),
            "CaptureTime": obj.get("CaptureTime"),
            "CaptureTimeAccuracy": obj.get("CaptureTimeAccuracy"),
            "AssistPosition": obj.get("AssistPosition"),
            "AssistAltitude": obj.get("AssistAltitude"),
            "Use2DSolver": obj.get("Use2DSolver")
        })
        return _obj


