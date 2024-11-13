import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listSensoryneuromuscularfactors(query) {
  return request({
    url: '/system/sensoryneuromuscularfactors/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getSensoryneuromuscularfactors(elderlyId) {
  return request({
    url: '/system/sensoryneuromuscularfactors/' + elderlyId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addSensoryneuromuscularfactors(data) {
  return request({
    url: '/system/sensoryneuromuscularfactors',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateSensoryneuromuscularfactors(data) {
  return request({
    url: '/system/sensoryneuromuscularfactors',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delSensoryneuromuscularfactors(elderlyId) {
  return request({
    url: '/system/sensoryneuromuscularfactors/' + elderlyId,
    method: 'delete'
  })
}
