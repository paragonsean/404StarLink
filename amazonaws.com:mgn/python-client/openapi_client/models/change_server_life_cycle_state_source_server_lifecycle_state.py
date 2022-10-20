# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class ChangeServerLifeCycleStateSourceServerLifecycleState(str, Enum):
    """
    ChangeServerLifeCycleStateSourceServerLifecycleState
    """

    """
    allowed enum values
    """
    READY_FOR_TEST = 'READY_FOR_TEST'
    READY_FOR_CUTOVER = 'READY_FOR_CUTOVER'
    CUTOVER = 'CUTOVER'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ChangeServerLifeCycleStateSourceServerLifecycleState from a JSON string"""
        return cls(json.loads(json_str))


