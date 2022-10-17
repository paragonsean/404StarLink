# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.create_queue_request_reservation_plan_settings import CreateQueueRequestReservationPlanSettings
from typing import Optional, Set
from typing_extensions import Self

class UpdateQueueRequest(BaseModel):
    """
    UpdateQueueRequest
    """ # noqa: E501
    description: Optional[StrictStr] = Field(default=None, description="The new description for the queue, if you are changing it.")
    reservation_plan_settings: Optional[CreateQueueRequestReservationPlanSettings] = Field(default=None, alias="reservationPlanSettings")
    status: Optional[StrictStr] = Field(default=None, description="Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error.")
    __properties: ClassVar[List[str]] = ["description", "reservationPlanSettings", "status"]

    @field_validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['ACTIVE', 'PAUSED']):
            raise ValueError("must be one of enum values ('ACTIVE', 'PAUSED')")
        return value

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
        """Create an instance of UpdateQueueRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of reservation_plan_settings
        if self.reservation_plan_settings:
            _dict['reservationPlanSettings'] = self.reservation_plan_settings.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UpdateQueueRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "description": obj.get("description"),
            "reservationPlanSettings": CreateQueueRequestReservationPlanSettings.from_dict(obj["reservationPlanSettings"]) if obj.get("reservationPlanSettings") is not None else None,
            "status": obj.get("status")
        })
        return _obj


