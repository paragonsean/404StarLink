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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.queue_reservation_plan import QueueReservationPlan
from typing import Optional, Set
from typing_extensions import Self

class Queue(BaseModel):
    """
    You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
    """ # noqa: E501
    arn: Optional[Any] = Field(default=None, alias="Arn")
    created_at: Optional[Any] = Field(default=None, alias="CreatedAt")
    description: Optional[Any] = Field(default=None, alias="Description")
    last_updated: Optional[Any] = Field(default=None, alias="LastUpdated")
    name: Any = Field(alias="Name")
    pricing_plan: Optional[Any] = Field(default=None, alias="PricingPlan")
    progressing_jobs_count: Optional[Any] = Field(default=None, alias="ProgressingJobsCount")
    reservation_plan: Optional[QueueReservationPlan] = Field(default=None, alias="ReservationPlan")
    status: Optional[Any] = Field(default=None, alias="Status")
    submitted_jobs_count: Optional[Any] = Field(default=None, alias="SubmittedJobsCount")
    type: Optional[Any] = Field(default=None, alias="Type")
    __properties: ClassVar[List[str]] = ["Arn", "CreatedAt", "Description", "LastUpdated", "Name", "PricingPlan", "ProgressingJobsCount", "ReservationPlan", "Status", "SubmittedJobsCount", "Type"]

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
        """Create an instance of Queue from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of pricing_plan
        if self.pricing_plan:
            _dict['PricingPlan'] = self.pricing_plan.to_dict()
        # override the default output from pydantic by calling `to_dict()` of reservation_plan
        if self.reservation_plan:
            _dict['ReservationPlan'] = self.reservation_plan.to_dict()
        # override the default output from pydantic by calling `to_dict()` of status
        if self.status:
            _dict['Status'] = self.status.to_dict()
        # override the default output from pydantic by calling `to_dict()` of type
        if self.type:
            _dict['Type'] = self.type.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Queue from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Arn": obj.get("Arn"),
            "CreatedAt": obj.get("CreatedAt"),
            "Description": obj.get("Description"),
            "LastUpdated": obj.get("LastUpdated"),
            "Name": obj.get("Name"),
            "PricingPlan": PricingPlan.from_dict(obj["PricingPlan"]) if obj.get("PricingPlan") is not None else None,
            "ProgressingJobsCount": obj.get("ProgressingJobsCount"),
            "ReservationPlan": QueueReservationPlan.from_dict(obj["ReservationPlan"]) if obj.get("ReservationPlan") is not None else None,
            "Status": QueueStatus.from_dict(obj["Status"]) if obj.get("Status") is not None else None,
            "SubmittedJobsCount": obj.get("SubmittedJobsCount"),
            "Type": Type.from_dict(obj["Type"]) if obj.get("Type") is not None else None
        })
        return _obj


