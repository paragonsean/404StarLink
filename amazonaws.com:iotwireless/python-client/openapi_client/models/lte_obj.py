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
from openapi_client.models.lte_obj_lte_local_id import LteObjLteLocalId
from typing import Optional, Set
from typing_extensions import Self

class LteObj(BaseModel):
    """
    LTE object.
    """ # noqa: E501
    mcc: Any = Field(alias="Mcc")
    mnc: Any = Field(alias="Mnc")
    eutran_cid: Any = Field(alias="EutranCid")
    tac: Optional[Any] = Field(default=None, alias="Tac")
    lte_local_id: Optional[LteObjLteLocalId] = Field(default=None, alias="LteLocalId")
    lte_timing_advance: Optional[Any] = Field(default=None, alias="LteTimingAdvance")
    rsrp: Optional[Any] = Field(default=None, alias="Rsrp")
    rsrq: Optional[Any] = Field(default=None, alias="Rsrq")
    nr_capable: Optional[Any] = Field(default=None, alias="NrCapable")
    lte_nmr: Optional[Any] = Field(default=None, alias="LteNmr")
    __properties: ClassVar[List[str]] = ["Mcc", "Mnc", "EutranCid", "Tac", "LteLocalId", "LteTimingAdvance", "Rsrp", "Rsrq", "NrCapable", "LteNmr"]

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
        """Create an instance of LteObj from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of lte_local_id
        if self.lte_local_id:
            _dict['LteLocalId'] = self.lte_local_id.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of LteObj from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Mcc": obj.get("Mcc"),
            "Mnc": obj.get("Mnc"),
            "EutranCid": obj.get("EutranCid"),
            "Tac": obj.get("Tac"),
            "LteLocalId": LteObjLteLocalId.from_dict(obj["LteLocalId"]) if obj.get("LteLocalId") is not None else None,
            "LteTimingAdvance": obj.get("LteTimingAdvance"),
            "Rsrp": obj.get("Rsrp"),
            "Rsrq": obj.get("Rsrq"),
            "NrCapable": obj.get("NrCapable"),
            "LteNmr": obj.get("LteNmr")
        })
        return _obj


