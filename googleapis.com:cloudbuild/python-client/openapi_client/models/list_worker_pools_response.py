# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.worker_pool import WorkerPool
from typing import Optional, Set
from typing_extensions import Self

class ListWorkerPoolsResponse(BaseModel):
    """
    Response containing existing `WorkerPools`.
    """ # noqa: E501
    next_page_token: Optional[StrictStr] = Field(default=None, description="Continuation token used to page through large result sets. Provide this value in a subsequent ListWorkerPoolsRequest to return the next page of results.", alias="nextPageToken")
    worker_pools: Optional[List[WorkerPool]] = Field(default=None, description="`WorkerPools` for the specified project.", alias="workerPools")
    __properties: ClassVar[List[str]] = ["nextPageToken", "workerPools"]

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
        """Create an instance of ListWorkerPoolsResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in worker_pools (list)
        _items = []
        if self.worker_pools:
            for _item_worker_pools in self.worker_pools:
                if _item_worker_pools:
                    _items.append(_item_worker_pools.to_dict())
            _dict['workerPools'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ListWorkerPoolsResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "nextPageToken": obj.get("nextPageToken"),
            "workerPools": [WorkerPool.from_dict(_item) for _item in obj["workerPools"]] if obj.get("workerPools") is not None else None
        })
        return _obj


